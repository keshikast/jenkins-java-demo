pipeline {
    agent any

    triggers {
        // Replaces pollSCM with GitHub Webhook push listener
        githubPush()
    }

    stages {
        stage('Compile') {
            steps {
                sh '/opt/homebrew/opt/maven/bin/mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh '/opt/homebrew/opt/maven/bin/mvn test'
            }
        }
        stage('Package') {
            steps {
                sh '/opt/homebrew/opt/maven/bin/mvn package -DskipTests'
            }
        }
    }
}
