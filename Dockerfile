FROM openJDK:18.0.1_askpjdas

LABEL maintainer=Patti

WORKDIR /app

COPY build/docker/libs/ libs/
COPY build/docker/resources/ resources/
COPY build/docker/classes/ classes/

EXPOSE 80 8081

CMD ["sh", "-c", "java ${JAVA_OPTS} -cp /app/resources:/app/classes:/app/libs/* com.example.fibonacciApplication"]