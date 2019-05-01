pipeline {
    agent any
    stages {
        stage ('Checkout') {
            git branch:'master', url: 'https://github.com/uparix/clojure-archetype'
        }
        stage('Build') {
            steps {
                sh 'mvn -B clean deploy'
            }
        }
    }
}