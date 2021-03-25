pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://namph16@bitbucket.org/unifiedpost/myid-user-service.git'
                    }
                    branch 'feature/MDC-299'
                }
            }
        }
    }
}

pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}