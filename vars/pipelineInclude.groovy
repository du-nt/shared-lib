def call(body) {
    pipeline {
        stages {
            stage("Prepare Build Environment") {
                steps {
                    script{
                    withCredentials([file(credentialsId: "wif-config-file", variable: 'GC_KEY')]) {
                        sh 'echo $GC_KEY'
                        }
                    }
                }
            }
        }
    }
}