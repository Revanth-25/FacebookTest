pipeline{
  agent any 
           stages {
                   stage('Build')
                        {
                         steps{
                        //bat "rmdir   /s  /q  FacebookTest"
                        bat "git clone https://github.com/Revanth-25/FacebookTest.git"
                        bat "mvn clean -f FacebookTest"
                        echo 'Build Done'
                             }
                         }
                    stage('Test'){
                             steps{
                                  bat "mvn test -f FacebookTest"
                                   echo 'Tests Done'
                                  }
                             }
 
                 }
          }
