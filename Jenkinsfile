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
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                    # Stop running app (if any)
                    pkill -f "java -jar" || true

                    # Start new app on port 1000
                    nohup java -jar target/*.jar --server.port=10000 > /dev/null 2>&1 &
                '''
            }
        }
    }
}
