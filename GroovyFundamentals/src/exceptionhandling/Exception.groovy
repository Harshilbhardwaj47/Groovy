package exceptionhandling

class Example {
	static void main(String[] args) {
		try {
			node('master'){

				stage('Code Checkout')
				cleanWs()

				status.check([

					branch: 'main',

					repo: 'https://github.com/Harshilbhardwaj47/spring-petclinic.git'

				])

				def specs = [:]
				def specsDir = "./Specs/V1.0"

				if(fileExists(specsDir + "/ci-spec.yml")){
					ci_specs = readYaml file : specsDir + "/ci-spec.yml"
					specs = specs + ci_specs
				}

				stage('Code build')



				build.check([


					command1 : specs.Build.command1,




				])
			}
		} catch(Exception ex) {
			println ex.getCause();
			println ex.getMessage();
		}
	}
}// use class while doing exception handling it helps out