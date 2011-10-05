package org.realtors.rets.util.dmql;

public enum BinaryOperator { 
	And(","), Or("|");

	private String retsDmql;
	private BinaryOperator(String retsDmql) {
		this.retsDmql = retsDmql;
	}
	public String toRetsDmql() {
		return this.retsDmql;
	}
}