def call(body) {
    pipeline {
    agent { label 'linux' }
    stages {
      stage('Run') {
        steps {
          echo "Hello!"
        }
      }
    }
  }
}