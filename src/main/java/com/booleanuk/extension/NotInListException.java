package com.booleanuk.extension;

public class NotInListException extends Exception {
	public NotInListException(int id){
		super("No task with id "+id+" in list");
	}
}
