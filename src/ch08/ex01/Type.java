package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE) 
public @interface Type { //������̼�
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS) //�⺻ ���ټ� CLASS.
@Target(ElementType.FIELD)
@interface Field{ //�ʵ��� ������̼�
	int value(); //value�� �⺻ �Ӽ���.
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor { //������ ������̼�
	int value() default 0; //�⺻�� �������� ������ 0��.
}

//�������� Ŭ����(�⺻��)
@Target(ElementType.METHOD)
@interface Method{//�޼ҵ� ������̼�
	
}

@Target(ElementType.PARAMETER)
@interface Param{
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation //������̼��̶�� �̸��� ������̼��� ���þ�����̼ǿ��� ����Ѵ�.
@interface Local{
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation {
	
}

@Target({ElementType.TYPE, ElementType.FIELD}) //target n�� ��������
@interface Universal {
	
}
