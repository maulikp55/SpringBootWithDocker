pipeline {
	environment {
   	 registry = "maulikjpatel1993/spring-boot-docker-jenkins:latest"
   	 registryCredential = 'docker'
   	 dockerImage = ''
  	}	
    agent any
    stages {
       stage('Building Docker Image') {
	      steps{
	       	 script {
	         	 dockerImage = docker.build(registry)
	        }
	      }
    	}
    	stage('Deploy Docker Image') {
		  steps{
		    script {
		      docker.withRegistry( '', registryCredential ) {
		        dockerImage.push()
		      }
		    }
		  }
		}
		stage('Remove Unused docker image') {
	      steps{
	        bat "docker rmi $registry:$BUILD_NUMBER"
	      }
	    }
    }
}