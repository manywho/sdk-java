package com.manywho.sdk.services;

import com.google.inject.AbstractModule;
import com.manywho.sdk.api.security.AuthenticatedWho;
import com.manywho.sdk.services.configuration.ApplicationConfiguration;
import com.manywho.sdk.services.providers.AuthenticatedWhoProvider;
import com.manywho.sdk.services.providers.ReflectionsProvider;
import com.manywho.sdk.services.types.DummyTypeProvider;
import com.manywho.sdk.services.types.TypeProvider;
import org.jboss.resteasy.plugins.guice.RequestScoped;
import org.reflections.Reflections;

public class ServiceApplicationModule extends AbstractModule {
    private final String applicationPackage;

    public ServiceApplicationModule(String applicationPackage) {
        this.applicationPackage = applicationPackage;
    }

    @Override
    protected void configure() {
        bind(Reflections.class).toProvider(ReflectionsProvider.class).asEagerSingleton();
        bind(AuthenticatedWho.class).toProvider(AuthenticatedWhoProvider.class).in(RequestScoped.class);

        bind(TypeProvider.class).to(DummyTypeProvider.class);
        bind(ApplicationConfiguration.class).toInstance(new ApplicationConfiguration(applicationPackage));
    }
}