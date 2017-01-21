package model_params.copy;

public enum EmployeeType {

	ELECTRICIAN("������"),
	BUILDER("����"),
	FLOOR_MAN("���"),
	PLASTERER("����"),
	REGULAR("����"),
	PAINTER("����"),
	METALWORKER("����"),
	PLUMBER("���������"),
	ROOFMAN("���"),
	ALUMINUM("��� ���������"),
	TRACTOR("������"),
	SEAL("�����"),
	CLEANER("�����"),
	LAND_DEVELOPMENT("�����"),
	AIR_CONDITIONING("�����"),
	WOODMAN("���"),
	GARDEN("���"),
	GUARD("����"),
	FOREMAN("���� �����"),
	DRIVER("�����");
	
	
	
	String value;
	
	private EmployeeType(String value) {
		this.value = value;
	}
	
}
