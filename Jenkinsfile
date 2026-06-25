pipeline {

    agent any

    tools {
       maven 'Maven'
    }

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
                    ./mvnw clean verify
                '''
            }
        }

        stage() {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh '''
                        ./mvnw sonar:sonar
                    '''
                }
            }
        }


    }

    post {

       always {

          junit '**/target/surefire-reports/*.xml'

          jacoco()

       }

    }


}