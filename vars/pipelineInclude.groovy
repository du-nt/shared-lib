def call(body) {
    stages {
      stage('Run') {
        steps {
          echo "Hello!"
        }
      }
    }
  }