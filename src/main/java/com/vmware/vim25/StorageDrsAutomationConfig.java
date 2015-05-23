package com.vmware.vim25;

/**
 * Created by Michael Rice on Wed May 20 23:39:36 CDT 2015
 *
 * Copyright 2015 Michael Rice
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * @since 6.0
 */

public class StorageDrsAutomationConfig extends DynamicData {
    public String spaceLoadBalanceAutomationMode;

    public String ioLoadBalanceAutomationMode;

    public String ruleEnforcementAutomationMode;

    public String policyEnforcementAutomationMode;

    public String vmEvacuationAutomationMode;

    public String getSpaceLoadBalanceAutomationMode() {
        return spaceLoadBalanceAutomationMode;
    }

    public void setSpaceLoadBalanceAutomationMode(String spaceLoadBalanceAutomationMode) {
        this.spaceLoadBalanceAutomationMode = spaceLoadBalanceAutomationMode;
    }

    public String getIoLoadBalanceAutomationMode() {
        return ioLoadBalanceAutomationMode;
    }

    public void setIoLoadBalanceAutomationMode(String ioLoadBalanceAutomationMode) {
        this.ioLoadBalanceAutomationMode = ioLoadBalanceAutomationMode;
    }

    public String getRuleEnforcementAutomationMode() {
        return ruleEnforcementAutomationMode;
    }

    public void setRuleEnforcementAutomationMode(String ruleEnforcementAutomationMode) {
        this.ruleEnforcementAutomationMode = ruleEnforcementAutomationMode;
    }

    public String getPolicyEnforcementAutomationMode() {
        return policyEnforcementAutomationMode;
    }

    public void setPolicyEnforcementAutomationMode(String policyEnforcementAutomationMode) {
        this.policyEnforcementAutomationMode = policyEnforcementAutomationMode;
    }

    public String getVmEvacuationAutomationMode() {
        return vmEvacuationAutomationMode;
    }

    public void setVmEvacuationAutomationMode(String vmEvacuationAutomationMode) {
        this.vmEvacuationAutomationMode = vmEvacuationAutomationMode;
    }

}