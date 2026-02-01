pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo "Building branch: ${env.BRANCH_NAME}"
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            when {
                anyOf {
                    branch 'main'
                    branch pattern: "feature/.*", comparator: "REGEXP"
                }
            }
            steps {
                echo "Running tests on ${env.BRANCH_NAME}"
                sh 'mvn test'
            }
        }

        stage('Package') {
            when {
                branch pattern: "release/.*", comparator: "REGEXP"
            }
            steps {
                echo "Packaging release build"
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Deploy (Simulated)') {
            when {
                branch 'main'
            }
            steps {
                echo "Deploying application from main branch (simulation)"
            }
        }
    }

    post {
        success {
            echo "Pipeline SUCCESS for ${env.BRANCH_NAME}"
        }
        failure {
            echo "Pipeline FAILED for ${env.BRANCH_NAME}"
        }
    }
}
