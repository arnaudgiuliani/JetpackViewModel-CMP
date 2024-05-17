import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

class KoinKMPStarter {

    fun init(config: KoinAppDeclaration? = null) {
        startKoin {
            config?.invoke(this)
            modules(appModule)
        }
    }
}