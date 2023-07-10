package com.booleanuk.core;

import java.time.LocalDateTime;

public record Task (int id,String name, boolean status, LocalDateTime createTime){
}
