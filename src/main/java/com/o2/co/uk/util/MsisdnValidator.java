package com.o2.co.uk.util;

import org.springframework.stereotype.Component;

@Component
public class MsisdnValidator {
public String validateMsisdn(String msisdn) {
	if((msisdn.length()==10)&&(msisdn.matches("\\d+"))) {
		msisdn="+44"+msisdn;
		return msisdn;
	}
	else if((msisdn.length()==12)&&(msisdn.startsWith("44"))&&(msisdn.matches("\\d+"))) {
		msisdn="+"+msisdn;
		return msisdn;
	}
	else if((msisdn.length()==13) && (msisdn.startsWith("+44"))&&(msisdn.matches("\\+\\d+"))) {
		return msisdn;
	}
	else if((msisdn.length()==11)&&(msisdn.startsWith("0"))&&(msisdn.matches("\\d+"))) {
		msisdn="+44"+msisdn.substring(1,11);
		return msisdn;
	}
	else
		return "invalid";
}
}
