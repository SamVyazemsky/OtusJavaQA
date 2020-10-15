pipeline {
    
    agent any
    

    parameters{
    	string(
            name: 'branch_name',
            defaultValue: 'master',
            description: 'Choose your branch'
            )
    	}
    
    stages{
        stage('Pull from GitHub'){
            steps{
                slackSend(message: "Hello, we are on lesson!")
                git 'https://github.com/SamVyazemsky/OtusJavaQA'
            }
        }
        stage('Run maven clean'){
            steps{
                sh 'mvn clean'
                sh 'mvn -version'
            }
        }
    }
}
