package com.filestack.transforms.tasks;

import com.filestack.transforms.ImageTransformTask;

public class NegativeTask extends ImageTransformTask {

  // Constructor left public because this task can be used with default options
  // Builder doesn't make sense for this task
  public NegativeTask() {
    super("negative");
  }
}
