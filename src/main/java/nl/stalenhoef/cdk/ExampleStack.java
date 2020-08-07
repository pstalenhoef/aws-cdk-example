package nl.stalenhoef.cdk;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.services.s3.Bucket;
import software.amazon.awscdk.services.s3.BucketEncryption;
import software.amazon.awscdk.services.s3.BucketProps;
import software.amazon.awscdk.services.ec2.Vpc;

public class ExampleStack extends Stack {
    public ExampleStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public ExampleStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        Bucket bucket = new Bucket(this, "ExampleBucket", new BucketProps.Builder()
                .versioned(true)
                .encryption(BucketEncryption.KMS_MANAGED)
                .build());

        Vpc vpc = Vpc.Builder.create(this, "VPC").build();
    }
}
