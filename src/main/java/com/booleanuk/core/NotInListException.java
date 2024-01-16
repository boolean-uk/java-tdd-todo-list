package com.booleanuk.core;

public class NotInListException extends Exception {
	public NotInListException(int id){
		super("No task with id "+id+" in list");
	}
}
