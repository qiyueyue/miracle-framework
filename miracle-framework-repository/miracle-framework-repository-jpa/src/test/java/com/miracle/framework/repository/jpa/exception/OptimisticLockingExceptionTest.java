package com.miracle.framework.repository.jpa.exception;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.miracle.framework.repository.jpa.exception.OptimisticLockingException;
import com.miracle.framework.repository.jpa.fixture.entity.TestEntity;

public final class OptimisticLockingExceptionTest {
	
	@Test
	public void getField() {
		OptimisticLockingException optimisticLockingException = new OptimisticLockingException(new TestEntity());
		assertThat(optimisticLockingException.getField(), is("version"));
	}
	
	@Test
	public void getKey() {
		OptimisticLockingException optimisticLockingException = new OptimisticLockingException(new TestEntity());
		assertThat(optimisticLockingException.getKey(), is("OptimisticLock.TestEntity.version"));
	}
}
