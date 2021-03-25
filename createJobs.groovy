pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/shinichi495/jenkins-demo.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}