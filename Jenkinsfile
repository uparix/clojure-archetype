pipeline {
    agent any
    stages {
        stage ('Checkout') {
            steps {
                git branch:'master', url: 'https://github.com/uparix/clojure-archetype'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests -Puparix-releases clean deploy'
            }
        }
    }
}