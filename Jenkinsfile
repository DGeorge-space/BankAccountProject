pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/DGeorge-space/BankAccountProject.git'

            }
        }
        stage('Compile'){
            steps{

                sh "mvn compile"
            }
        }
        stage('Test'){
            steps{

                sh "mvn test"
            }
        }
        stage('complete'){
            steps{

                sh "echo Finished"
            }
        }
    }
}