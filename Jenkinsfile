pipeline {
  agent any
  
  environment {
	registry = "vishwavk2021/docker"
	registryCredential = 'Bri!!iouser2021'
	dockerImage = ''
  }
  stages{
  stage('Building our image') {
	steps{
	  script {
		sh 'docker login -u vishwavk2021 -p Bri!!iouser2021'
		sh 'docker build -t vishwavk2021/docker:$BUILD_NUMBER .'
		sh 'docker push vishwavk2021/docker:$BUILD_NUMBER'
	  }
	}
  }
  }
}
