package com.phase2.Junit;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

@RunWith(JUnitPlatform.class)
//@SelectPackages({"my2junitTest","myjunitTest"})

//@SelectClasses(ParametrizedTest.class)
@SelectClasses({com.phase2.Junit.Demo11IncludeExcludetags.class})
@ExcludeTags({"production"})

public class Junit5Runner {

}
