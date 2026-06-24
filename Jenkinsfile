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
                sh '''
                    chmod +x mvnw
                    ./mvnw clean package
                '''
            }
        }

        stage('Unit Test') {
            steps {
                sh './mvnw test'
            }
        }

    }
}