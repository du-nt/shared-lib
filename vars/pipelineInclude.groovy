def call(body) {
    script{
          withCredentials([file(credentialsId: "wif-config-file", variable: 'GC_KEY')]) {
            sh 'echo $GC_KEY'
	        }
        }
  }