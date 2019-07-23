// Copyright 2018 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buildfarm.worker;

import build.bazel.remote.execution.v2.Action;
import build.bazel.remote.execution.v2.ActionResult;
import build.bazel.remote.execution.v2.Command;
import build.bazel.remote.execution.v2.Digest;
import build.bazel.remote.execution.v2.Directory;
import build.bazel.remote.execution.v2.ExecutionStage;
import build.bazel.remote.execution.v2.Tree;
import build.buildfarm.common.DigestUtil;
import build.buildfarm.common.DigestUtil.ActionKey;
import build.buildfarm.common.Poller;
import build.buildfarm.common.Write;
import build.buildfarm.common.function.InterruptingConsumer;
import build.buildfarm.worker.CASFileCache;
import build.buildfarm.instance.Instance;
import build.buildfarm.instance.Instance.MatchListener;
import build.buildfarm.v1test.CASInsertionPolicy;
import build.buildfarm.v1test.ExecutionPolicy;
import build.buildfarm.v1test.QueueEntry;
import build.buildfarm.v1test.QueuedOperation;
import com.google.longrunning.Operation;
import com.google.protobuf.Duration;
import io.grpc.Deadline;
import java.nio.file.Path;
import java.util.function.Predicate;

class StubWorkerContext implements WorkerContext {
  @Override public String getName() { throw new UnsupportedOperationException(); }
  @Override public Poller createPoller(String name, QueueEntry queueEntry, ExecutionStage.Value stage) { throw new UnsupportedOperationException(); }
  @Override public void resumePoller(Poller poller, String name, QueueEntry queueEntry, ExecutionStage.Value stage, Runnable onFailure, Deadline deadline) { throw new UnsupportedOperationException(); }
  @Override public void match(MatchListener listener) throws InterruptedException { throw new UnsupportedOperationException(); }
  @Override public void requeue(Operation operation) { throw new UnsupportedOperationException(); }
  @Override public void deactivate(String operationName) { throw new UnsupportedOperationException(); }
  @Override public void logInfo(String msg) { }
  @Override public CASInsertionPolicy getFileCasPolicy() { throw new UnsupportedOperationException(); }
  @Override public CASInsertionPolicy getStdoutCasPolicy() { throw new UnsupportedOperationException(); }
  @Override public CASInsertionPolicy getStderrCasPolicy() { throw new UnsupportedOperationException(); }
  @Override public DigestUtil getDigestUtil() { throw new UnsupportedOperationException(); }
  @Override public ExecutionPolicy getExecutionPolicy(String name) { throw new UnsupportedOperationException(); }
  @Override public int getInputFetchStageWidth() { throw new UnsupportedOperationException(); }
  @Override public int getExecuteStageWidth() { throw new UnsupportedOperationException(); }
  @Override public boolean hasDefaultActionTimeout() { throw new UnsupportedOperationException(); }
  @Override public boolean hasMaximumActionTimeout() { throw new UnsupportedOperationException(); }
  @Override public boolean getStreamStdout() { throw new UnsupportedOperationException(); }
  @Override public boolean getStreamStderr() { throw new UnsupportedOperationException(); }
  @Override public Duration getDefaultActionTimeout() { throw new UnsupportedOperationException(); }
  @Override public Duration getMaximumActionTimeout() { throw new UnsupportedOperationException(); }
  @Override public QueuedOperation getQueuedOperation(QueueEntry queueEntry) { throw new UnsupportedOperationException(); }
  @Override public Path createExecDir(String operationName, Tree tree, Action action, Command command) { throw new UnsupportedOperationException(); }
  @Override public void destroyExecDir(Path execDir) { throw new UnsupportedOperationException(); }
  @Override public void uploadOutputs(ActionResult.Builder resultBuilder, Path actionRoot, Iterable<String> outputFiles, Iterable<String> outputDirs) { throw new UnsupportedOperationException(); }
  @Override public boolean putOperation(Operation operation, Action action) { throw new UnsupportedOperationException(); }
  @Override public Write getOperationStreamWrite(String name) { throw new UnsupportedOperationException(); }
  @Override public void putActionResult(ActionKey actionKey, ActionResult actionResult) { throw new UnsupportedOperationException(); }
};
