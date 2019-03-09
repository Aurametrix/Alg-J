class Graph {
  // ... see last article for our implementation
  let count = 0;
  const ENTRY_TIMES = new Array(MAX_VERTICES);
  const EXIT_TIMES = new Array(MAX_VERTICES);

  dfs(currentVertex) {
    if (finished) return;
    let nextVertex;

    VISITED[currentVertex] = true;
    count += 1;
    ENTRY_TIMES[currentVertex] = count;
    console.log("PRE-PROCESSED!");
    tempVertex = this.connections[currentVertex];

    while (tempVertex) {
      nextVertex = tempVertex.adjacencyInfo;

      if (!VISITED[nextVertex]) {
        PARENTS[nextVertex] = currentVertex;
        console.log(`PROCESSED EDGE ${currentVertex}=>${nextVertex}`);
        this.dfs(nextVertex);
      } else if (
        (!PROCESSED[nextVertex] && PARENTS[currentVertex] !== nextVertex) ||
        this.isDirected
      ) {
        console.log(`PROCESSED EDGE ${currentVertex}=>${nextVertex}`);
        if (finished) return;
        tempVertex = tempVertex.nextVertex;
      }
    }

    console.log("POST-PROCESSED");
    count +=1;
    EXIT_TIMES[currentVertex] = count;
    PROCESSED[currentVertex] = true;
  }
}

Why use depth-first search?
