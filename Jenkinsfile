pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build + Test + Coverage') {
            steps {
                sh '''
                    chmod +x mvnw
                    ./mvnw clean verify
                '''
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