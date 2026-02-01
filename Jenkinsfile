pipeline {
    agent any

    tools {
        maven 'Maven_3'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn -v'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy (Simulated)') {
            when {
                branch 'main'
            }
            steps {
                echo 'Deploying application (simulated)'
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
