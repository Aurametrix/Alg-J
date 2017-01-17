package solandra;

import java.io.IOException;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import lucandra.CassandraUtils;
import lucandra.IndexReader;
import lucandra.cluster.CassandraIndexManager;
import lucandra.cluster.IndexManagerService;

import com.google.common.collect.MapMaker;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.config.Schema;
import org.apache.cassandra.db.Row;
import org.apache.cassandra.db.filter.QueryPath;
import org.apache.cassandra.service.StorageService;
import org.apache.cassandra.thrift.ConsistencyLevel;
import org.apache.cassandra.utils.FBUtilities;
import org.apache.log4j.Logger;
import org.apache.solr.common.params.ShardParams;
import org.apache.solr.handler.component.ResponseBuilder;
import org.apache.solr.search.SolrIndexReader;
