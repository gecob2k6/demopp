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
                    ./mvnw clean verify
                '''
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh '''
                        chmod +x mvnw
                        ./mvnw org.sonarsource.scanner.maven:sonar-maven-plugin:4.0.0.4121:sonar
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