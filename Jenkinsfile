pipeline {
    agent any

    environment {
        IMAGE_NAME = 'umamahesh571/evolve-ecommerce'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/umamahesh571/evolve-ecommerce.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build & Push') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    sh '''
                        docker build -t $IMAGE_NAME .
                        echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
                        docker push $IMAGE_NAME
                    '''
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh '''
                    kubectl apply -f deployment.yaml
                    kubectl apply -f service.yaml
                '''
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline completed successfully.'
        }
        failure {
            echo '❌ Pipeline failed. Check the build logs for details.'
        }
        always {
            echo '📦 Build finished.'
        }
    }
}
