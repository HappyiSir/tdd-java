package com.thoughtworks.demo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DemoTest {

  @Test
  public void this_is_a_demo() {
    assertThat(1 + 2, is(3));
  }

}
