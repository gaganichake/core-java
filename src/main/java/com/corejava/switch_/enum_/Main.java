package com.corejava.switch_.enum_;


public class Main {
    
	public static void main(String[] arg){
	    
	    for(EnumUtil.RuleParamCase ruleParamCase : EnumUtil.RuleParamCase.values()){
	        
	    	EnumUtil.RuleParamCase.RuleParam ruleParam = ruleParamCase.getRuleParam("GRP20", "SRC09", "SLC55");
	        
	        System.out.println("GrpCode : " + ruleParam.getGrpCode()
					+ ", SrcCode : " + ruleParam.getSrcCode()
					+ ", SlcCode : " + ruleParam.getSlcCode());
	        
	    }
	 }

}
