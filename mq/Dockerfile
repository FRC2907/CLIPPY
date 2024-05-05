FROM emqx/emqx:5.6.1

RUN echo '{allow, all}.' > /opt/emqx/etc/acl.conf

HEALTHCHECK --interval=5s --timeout=25s --retries=5 CMD /opt/emqx/bin/emqx ctl status
