module server {
    requires java.xml.ws;
     requires jdk.httpserver;
      requires java.logging; 

    // generated by WebServiceWrapperGenerator
    exports fromjava.inherited_annotations.server.jaxws;
    exports fromjava.inherited_annotations.server;
    exports fromjava.inherited_annotations.server.base;
    exports fromjava.inherited_annotations.server.base2;
    exports fromjava.inherited_annotations.server.base3;
}