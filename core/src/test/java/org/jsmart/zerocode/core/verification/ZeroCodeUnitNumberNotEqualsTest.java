package org.jsmart.zerocode.core.verification;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.tests.customrunner.TestOnlyZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("config_hosts.properties")
@RunWith(TestOnlyZeroCodeUnitRunner.class)
public class ZeroCodeUnitNumberNotEqualsTest {

    @Test
    @JsonTestCase("01_verification_test_cases/06_number_not_equals_test.json")
    public void willPassIfNotEqualsToSame_number() throws Exception {

    }
}

