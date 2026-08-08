pipeline{
    agent any 
    environment{
        CHAT_ID="your-chat-id"
        TOKEN="your-token"
    }
    stages{
        stage("Send Telegram Message"){
            steps{
                script{
                    def message="""
                    Hello from jenkins 
                    THis is th message from your pipeline 
                    """ 
                    sh """
                        curl -s -X POST "https://api.telegram.org/bot${TOKEN}/sendMessage" -d chat_id="${CHAT_ID}" -d parse_mode="Markdown"  -d text="${message}"

                        """  
                }
               
            }
        }
    }
}