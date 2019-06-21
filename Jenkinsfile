def gitUrl = "https://github.com/c417-jenkins/chocolate-factory.git"
node {
    stage("checkout git") {
      dir("${WORKSPACE}") {
          git url: "${gitUrl}", branch: "master"
          sh "ls -la"
      }
    }

    stage("Lint") {
      dir("${WORKSPACE}") {
        println("TODO: Add lint")
      }
    }

    stage("Unit Test") {
      dir("${WORKSPACE}") {
        withMaven( maven: "M3") {
          sh "mvn test"
        }
      }
    }

    stage("build") {
      dir("${WORKSPACE}") {
        withMaven( maven: "M3") {
          sh "mvn pakcage"
        }
      }
    }

    stage("Integration Test") {
      dir("${WORKSPACE}") {
        println("TODO: integration test")
      }
    }


    stage("deploy") {
      println("deploy delicious chocolate!!")
    }

}
