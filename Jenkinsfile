pipeline
{
	agent any
	tools
	{
		maven 'MAVEN_HOME'
	}
	
	stages
	{
		stage('Welcome Stage')
		{
			steps
			{
				echo 'Welcome to Jenkins Pipeline'
			}
		}
		
		stage('Clean Stage')
		{
			steps
			{
				bat 'mvn clean'
			}
		}	
		stage('Clean Stage Success')
		{
			steps
			{
				echo "Clean Success"
			}
		}
 		stage('Test Stage')
		{
			steps
			{
				bat 'mvn test'
			}
		}		
		stage('Build & Install Stage')
		{
			steps
			{
				bat 'mvn install'
			}
		}	
		
		stage('Build Success')
		{
			steps
			{
				echo "Build Success"
			}
		}	
		
		
	}
}	