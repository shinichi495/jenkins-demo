pipelineJob('myid-user-server-build-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/shinichi495/myid-test-api.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob('myid-user-server-docker-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/shinichi495/myid-test-api.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}
