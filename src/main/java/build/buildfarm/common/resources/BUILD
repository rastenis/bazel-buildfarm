load("@rules_proto//proto:defs.bzl", "proto_library")
load("@rules_java//java:defs.bzl", "java_proto_library")

package(default_visibility = ["//visibility:public"])

proto_library(
    name = "resource_proto",
    srcs = ["resource.proto"],
    deps = [
        "@com_google_protobuf//:duration_proto",
        "@com_google_protobuf//:timestamp_proto",
        "@googleapis//:google_api_annotations_proto",
        "@googleapis//:google_longrunning_operations_proto",
        "@googleapis//:google_rpc_status_proto",
        "@remote_apis//build/bazel/remote/execution/v2:remote_execution_proto",
    ],
)

java_proto_library(
    name = "resource_java_proto",
    deps = [
        ":resource_proto",
    ],
)

java_library(
    name = "resources",
    srcs = ["ResourceParser.java"],
    visibility = ["//visibility:public"],
    deps = [
        "//src/main/java/build/buildfarm/common/resources:resource_java_proto",
        "//src/main/protobuf:build_buildfarm_v1test_buildfarm_java_proto",
        "//third_party/jedis",
        "@googleapis//:google_longrunning_operations_java_proto",
        "@googleapis//:google_rpc_code_java_proto",
        "@googleapis//:google_rpc_error_details_java_proto",
        "@maven//:com_github_jnr_jnr_constants",
        "@maven//:com_github_jnr_jnr_ffi",
        "@maven//:com_github_jnr_jnr_posix",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_failureaccess",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_protobuf_protobuf_java",
        "@maven//:com_google_protobuf_protobuf_java_util",
        "@maven//:commons_io_commons_io",
        "@maven//:io_grpc_grpc_api",
        "@maven//:io_grpc_grpc_context",
        "@maven//:io_grpc_grpc_protobuf",
        "@maven//:org_apache_commons_commons_compress",
        "@maven//:org_apache_commons_commons_lang3",
        "@maven//:org_threeten_threetenbp",
        "@remote_apis//:build_bazel_remote_execution_v2_remote_execution_java_proto",
    ],
)
