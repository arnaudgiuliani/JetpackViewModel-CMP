import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule = module {
    single { "Hello world!" }
    viewModelOf(::MainViewModel)
}