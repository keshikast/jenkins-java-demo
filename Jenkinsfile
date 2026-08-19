pipeline {
    agent any

    // Trigger settings can also be defined directly inside the Jenkinsfile
    triggers {
        // Polls SCM every 2 minutes for new commits
        pollSCM('H/2 * * * *')
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code from GitHub...'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java classes...'
                sh '/opt/homebrew/opt/maven/bin/mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running JUnit Tests...'
                sh '/opt/homebrew/opt/maven/bin/mvn test'
            }
        }

        stage('Package Jar') {
            steps {
                echo 'Packaging application into JAR...'
                sh '/opt/homebrew/opt/maven/bin/mvn package -DskipTests'
            }
        }
    }

    post {
        success {
            echo 'Java Build & Tests Passed Successfully!'
        }
        failure {
            echo 'Build Failed! Check Maven compilation or test errors.'
        }
    }
}
