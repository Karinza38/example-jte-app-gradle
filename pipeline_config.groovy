/*
  This file will inherit the configurations set via: 
    https://github.com/steven-terrana/example-jte-configuration/blob/master/pipeline_config.groovy
  
  This repository level configuration file should now add configs 
  that are specific to this repo, such as the use of gradle for build() and
  unit_test() 
*/
libraries{
  gradle  

  example {
    number = 3
    message = "message is printed"
  }
  
}
