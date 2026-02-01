pipeline {
    agent any

    stages {

        stage('Main Branch - Build & Test') {
            when {
                branch 'main'
            }
            steps {
                echo "Running pipeline for MAIN branch"
                sh 'mvn clean test'
            }
        }

        stage('Feature Branch - Build Only') {
            when {
                expression { env.BRANCH_NAME.startsWith('feature/') }
            }
            steps {
                echo "Running pipeline for FEATURE branch"
                sh 'mvn clean compile'
            }
        }

        stage('Release Branch - Full Build') {
            when {
                expression { env.BRANCH_NAME.startsWith('release/') }
            }
            steps {
                echo "Running pipeline for RELEASE branch"
                sh 'mvn clean test package'
            }
        }
    }

    post {
        always {
            echo "Pipeline finished for branch: ${env.BRANCH_NAME}"
        }
        success {
            echo "SUCCESS"
        }
        failure {
            echo "FAILURE"
        }
    }
}
