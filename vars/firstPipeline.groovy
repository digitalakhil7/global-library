import com.akhil.builds.Calculator;
def call(Map piepelineParams){
    library('com.akhil.sl')
    Calculator calculator = new Calculator(this)
    pipeline{
        agent any
        environment{
            APP_NAME = "${piepelineParams.appName}"
        }
        stages{
            stage('calc'){
                steps{
                    script{
                        println calculator.add(5,10)
                        echo "Microservice name is: ${APP_NAME}"
                    }
                }
            }
        }
    }
}